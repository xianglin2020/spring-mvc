<%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 18-7-10
  Time: 下午11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Multiple file uploads with progress bar</h1>
<div id="progressBar" style="height: 20px;border: 2px solid green;">
    <div id="bar" style="height: 100%;background: #33dd33;width: 0%"></div>
</div>
<form>
    <input type="file" id="files" multiple>
    <br>
    <output id="selectedFiles"></output>
    <input type="button" id="uploadButton" value="Upload">
</form>
<div id="debug" style="height: 100px;border: 2px solid green;overflow: auto;"></div>


<%--以下是JavaScript--%>
<script>
    var totalFileLength, totalUpload, fileCount, filesUploaded;

    function debug(s) {
        var debug = document.getElementById('debug');
        if (debug) {
            debug.innerHTML = debug.innerHTML + '<br/>' + s;
        }
    }

    function onUploadComplete(e) {
        totalUpload += document.getElementById('files').files[filesUploaded].size;
        filesUploaded++;
        debug('complete ' + filesUploaded + " of " + fileCount);
        debug('totalUploaded: ' + totalUpload);
        if (filesUploaded < fileCount) {
            uploadNext();
        } else {
            var bar = document.getElementById('bar');
            bar.style.width = '100%';
            bar.innerHTML = '100% complete';
            alert('Finished upload file(s)');
        }
    }

    function onFileSelect(e) {
        var files = e.target.files;
        var output = [];
        fileCount = files.length;
        totalFileLength = 0;
        for (var i = 0; i < fileCount; i++) {
            var file = files[i];
            output.push(file.name, '(', file.size, 'bytes,', file.lastModifiedDate.toLocaleDateString(), ')');
            output.push('<br/>');
            debug('add ' + file.size);
            totalFileLength += file.size;
        }
        document.getElementById('selectedFiles').innerHTML = output.join('');
        debug('totalFileLength:' + totalFileLength);
    }

    function onUploadProgress(e) {
        if (e.lengthComputable) {
            var percentComplete = parseInt((e.loaded + totalUpload) * 100 / totalFileLength);
            var bar = document.getElementById('bar');
            bar.style.width = percentComplete + ' % complete';
        } else {
            debug('unable to complete');
        }
    }

    function onUploadFailed(e) {
        alert('Error upload files');
    }

    function uploadNext() {
        var xhr = new XMLHttpRequest();
        var fd = new FormData();
        var file = document.getElementById('files').files[filesUploaded];
        fd.append('multipartFile', file);
        xhr.upload.addEventListener("progress", onUploadProgress, false);
        xhr.addEventListener("load", onUploadComplete, false);
        xhr.addEventListener("error", onUploadFailed, false);
        xhr.open("POST", "file_upload");
        debug('uploading ' + file.name);
        xhr.send(fd);
    }

    function startUpload() {
        totalUpload = filesUploaded = 0;
        uploadNext();
    }

    window.onload = function () {
        document.getElementById('files').addEventListener('change', onFileSelect, false);
        document.getElementById('uploadButton').addEventListener('click', startUpload, false);
    }
</script>
</body>
</html>
