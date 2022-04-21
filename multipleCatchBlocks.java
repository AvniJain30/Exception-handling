public class multipleCatchBlocks {
    public static void main(String[] args){
        try{
            int a[] = new int[5];
            System.out.println(a[10]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(Exception e){
            System.out.println("parent Exception");
        }
        System.out.println("rest of code");
    }
}
