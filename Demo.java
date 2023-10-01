package LAB2;

public class Demo {
    public static void main(String[] args) {

        Music m1 = new Music("All too well", 445, "acoustic", "Taylors version",new Date(13, 2, 2008),new Artist("ali","pak",8000));
        System.out.println(m1);

        Music m2 = new Music("Sajni",  245, "pop","xyz version", new Date(1,4,2021), new Artist("Strings", "Pakistani", 100 ));
        System.out.println(m2);

        Music m3 = new Music("baarishein", 445, "acoustic", "Anuv",new Date(23, 7, 2008),new Artist("Anuv","Indian",500));
        System.out.println(m3);

        Music m4 = new Music("alag asmaan", 145, "acoustic", "xxx",new Date(13, 2, 2004),new Artist("Anuv Jain","Indian",500));
        System.out.println(m4);

        Music m5 = new Music("girls", 325, "pop", "xo",new Date(13, 2, 2004),new Artist("Juice Wrld","African",500));
        System.out.println(m5);

        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(m5));

        Music list[]= new Music[5];
        list[0]=m1;
        list[1]=m2;
        list[2]=m3;
        list[3]=m4;
        list[4]=m5;
        for(int i =0;i<5;i++){
            System.out.println(list[i]);
        }

    }
 }