* Converter 是一般工具，可以将一种类型转换为另一种类型。例如，将String转换为LocalDate，或者将Long转换为LocalDate。Converter既可以用在Web层，也可以用在其它层。
* Formatter 只能将String转换为另一种Java类型。例如将String转换为LocalDate，但不能将Long转换为LocalDate。
* 因此Formatter适用于Web层。为此，在Spring MVC 应用中，选择Formatter比选择Converter更合适。