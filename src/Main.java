
class Add
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static  double add(double a, double b)
    {
        return  a+b;
    }
}
class  MethodOverloading
{

    public  static void main(String[] args)
    {


        System.out.println(Add.add(45,75));
        System.out.println(Add.add(69.5,59.9));



    }
}