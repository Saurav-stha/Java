class ABC {
    public static void main(String[] args) {
        Test t=new Test();
        t.display(); 
        System.out.println("\nSum is "+t.add()) ;    
    }
}
    class Test{
        int add(){
            int a=10;int b=20;
            return (a+b); }
    void display(){
          int zz=add();
             System.out.println(zz);  
    }
}