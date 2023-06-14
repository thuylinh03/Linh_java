interface Demo1{
    void print();
}

class A6 implements Demo1{
    public void print(){
        System.out.println("Hello");
    }

    public static void main(String[] args){
        A6 c = new A6();
        c.print();
    }
}