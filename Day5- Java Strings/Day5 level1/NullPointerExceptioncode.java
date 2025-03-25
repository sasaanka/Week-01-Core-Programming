class NullPointerExceptioncode {
    public static void testGenerateException() {
        try {
            NullPointerExceptioncode.generateexception();
            System.out.println("testGenerateException FAILED: Exception was expected");
        } catch (NullPointerException e) {
            System.out.println("testGenerateException PASSED: Exception was caught");
        }
    }
    public static void testHandleException() {
        try {
            NullPointerExceptioncode.handleexception();
            System.out.println("testHandleException PASSED: No crash occurred");
        } catch (Exception e) {
            System.out.println("testHandleException FAILED: Unexpected exception - " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        System.out.println("Running manual tests...");
        testGenerateException();
        testHandleException();
    }
    private static void generateexception() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    private static void handleexception() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
