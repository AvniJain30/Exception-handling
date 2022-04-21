class InvalidAgeException extends Exception{
    public InvalidAgeException(String s){
        super(s);
    }
}
public class customException {
    static void validate(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age is not valid to vote! ");
        }
        else{
            System.out.println("Age is valid to vote! ");
        }
    }

    public static void main(String[] args){
        try{
            validate(16);
        }
        catch(InvalidAgeException e){
            System.out.println("Caught the exception");
            System.out.println("exception occured " + e);
        }
        System.out.println("rest of the code");
    }
}
