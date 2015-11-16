package com.gmail.mordress.lab3;

import com.gmail.mordress.lab3.xml.VaucherXmlValidator;

import java.io.File;

/*
1. Создать файл XML и соответствующую ему схему XSD.
2. При разработке XSD использовать простые и комплексные типы, перечисления, шаблоны и предельные значения, обязательно использование атрибутов и типа ID.
3. Создать Java-класс, соответствующий данному описанию.
4. Создать Java-приложение для разбора XML-документа и инициализации коллекции объектов информацией из XML-файла. Для разбора использовать SAX, DOM или StAX парсеры. Для сортировки объектов использовать интерфейс Comparator.
5. Произвести проверку XML-документа с привлечением XSD.
*16. Туристические путевки.
    Туристические путевки, предлагаемые агентством, имеют следующие характеристики:
    Type – тип путевки (выходного дня, экскурсионная, отдых, паломничество и т.д.).
    Country – страна для путешествия.
    Number days/nights – количество дней и ночей.
    Тransport – вид перевозки туристов (авиа, ж/д, авто, лайнер).
    Hotel characteristic (должно быть несколько) – количество звезд, включено ли питание и какое (HB, BB, Al), какой номер (1,2,3-х местные), есть ли телевизор, кондиционер и т.д..
    Сost – стоимость путевки (сколько и что включено).
    Корневой элемент назвать Тourist voucher.
* */
public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        VaucherXmlValidator validator = new VaucherXmlValidator("resources" + File.separator + "Vouchers.xml");
        System.out.println(validator.validate());
    }
}
