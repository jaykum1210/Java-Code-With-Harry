interface parent{
    void meth1();
    void meth2();
}

interface child extends parent{
    void meth3();
    void meth4();
}

class classparent implements child{
    @Override
    public void meth1(){
        System.out.println("Method 1");
    }
    @Override
    public void meth2(){
        System.out.println("Method 2");
    }
    @Override
    public void meth3(){
        System.out.println("Method 3");
    }
    @Override
    public void meth4(){
        System.out.println("Method 4");
    }
}

public class InheritanceInterface{
    public static void main(String[] args) {
        classparent cp = new classparent();
        cp.meth4();
    }
}