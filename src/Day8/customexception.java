package Day8;
// Custom Exception Class
class OverspeedException extends Exception {
}

// Police class with check method
class Police {
    static void verifySpeed(int speed) throws OverspeedException {
        if (speed > 100) {
            throw new OverspeedException();
        }
    }
}

// Main class
public class customexception {
    public static void main(String[] args) {
        try {
            Police.verifySpeed(120); // Will throw exception
            Police.verifySpeed(23);  // Won't be called due to exception above
        } catch (OverspeedException e) {
            System.out.println("Fine! It's over speed.");
        }
    }
}
