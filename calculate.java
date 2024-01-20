class calcutater
{
    public float addition(int a, int b)
    {
        return a + b;
    }
    public float substraction(int a, int b)
    {
        return a - b;
    }
    public float multiplication(int a, int b)
    {
        return a * b;
    }
    public float division(int a, int b)
    {
        return a / b;
    }
}
class Simple_calcutater
{
    public static void main(String args[])
    {
        calcutater c = new calcutater();
        System.out.println("Add the two numbers :"+c.addition(50,40));

        System.out.println("Difference the two numbers :"+c.substraction(70,40));

        System.out.println("Product of two numbers :"+c.multiplication(20,30));
        
        System.out.println("Division the two numbers :"+c.division(90,40));
        

    }
}