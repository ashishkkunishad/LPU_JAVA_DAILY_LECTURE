class X {
    int x;
    void setx(int x){
        this.x=x;
    }
    int getx(){
        return x;
    }
}

class Y extends X{
    int y;
    void sety(int y){
        this.y=y;
    }
    int gety(){
        return y;
    }
}

class abc{
    public static void main(String args[]) {
        Y obj= new Y();
        obj.setx(6);
        System.out.println(obj.getx());
    }
}
