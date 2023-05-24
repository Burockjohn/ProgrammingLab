Finish the `Color` class.

There are number of ways to describe color to computers, smart phones, tablets, browsers etc.

One of the popular ways is to use RGB (red, green, blue) value.

>More info: https://en.wikipedia.org/wiki/RGB_color_model
RGB chart:  https://www.rapidtables.com/web/color/RGB_Color.html

In this task, we are going to write a simple Color class, that can represent only few major colors.

Available colors are already initialized to static final arrays.

We will practice :

- overloading constructors
- this() keyword
- comparing arrays
- overriding toString method

Examples:

```
Color color = new Color();
System.out.println(color.toString() ) ; // prints "white"

Color color2 = new Color(255, 0, 0);
System.out.println(color2.toString() ) ; // prints "red"

Color color3 = new Color(255, 44, 88);
System.out.println(color3.toString() ) ; // prints "n/a"

Color color4 = new Color(192, 192, 192);
System.out.println(color4 ) ; // prints "light gray"
```