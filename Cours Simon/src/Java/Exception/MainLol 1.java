//package Java.Exception;
//
//public class MainLol {
//
//    MainLol() throws DontCallMeBitchException {
//        throw new DontCallMeBitchException();
//    }
//
//
//    public static void main(String[] args) {
//
//
//        try {
//            doException();
//        } catch (DontCallMeBitchException e) {
//            System.out.println("oups");
//        }
//
//        try {
//            addPositiveNumbers(5, -5);
//        } catch (NegativeNumberException e) {
//            System.out.println("L'un des nombres est negatifs");
//        } catch (DontCallMeBitchException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(addNumbers(5, 12));
//        System.out.println(addNumbers(null, 8));
//    }
//
//
//    public static void doException() throws DontCallMeBitchException {
//        throw new DontCallMeBitchException();
//    }
//
//    public static void addPositiveNumbers(int number, int number2) throws NegativeNumberException, DontCallMeBitchException {
//        if (number < 0 || number2 < 0) {
//            throw new NegativeNumberException();
//        }
//
//        throw new DontCallMeBitchException();
//    }
//
//    public static int addNumbers(Integer number,
//                                 Integer numbers2) {
////        // NPE
////        return number + numbers2;
//        if (number == null || numbers2 == null) {
//            // protect your method
//            throw new IllegalArgumentException("One of the field in null, noobard");
//        }
//
//        // process métier complexe
//
//        return number + numbers2;
//    }
//}
//
//// CheckedException
//class DontCallMeBitchException extends Exception {}
//class NegativeNumberException extends Exception {}
//class LolRuntimeException extends RuntimeException {}
