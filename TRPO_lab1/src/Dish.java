public abstract class Dish
{
    //Меню содержит блюда: напитки и тосты (реализовать через
    //наследование). Напитки и тосты имеют название, стоимость, калорийность и метку vegan friendly
    private String name;
    private double price;
    private boolean veganFriedly;
    private double colorieContent;

    public Dish(String name,Double price,Boolean veganFriedly,Double colorieContent )
    {
        this.name = name;
        this.price = price;
        this.veganFriedly = veganFriedly;
        this.colorieContent = colorieContent;
    }

    @Override
    public String  toString()
    {
        return("Наименование:" + name.toString() + " Стоимость: " + price + "£" + " Для vegans: " + veganFriedly+ " Калорийность: " + colorieContent);
    }

    public boolean getVeganFriedly()
    {
        return  veganFriedly;
    }

    public double getColorieContent()
    {
        return  colorieContent;
    }

    public double getPrice()
    {
        return price;
    }

}

