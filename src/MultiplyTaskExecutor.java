public class MultiplyTaskExecutor {

    private ExecutionResult result = new ExecutionResult<>();

    public ExecutionResult<Long> multiply(Long number1, Long number2){
        try {
            Math.multiplyExact(number1, number2);
            result.setSuccess(true);
            result.setErrorMessage("");
            result.setResult(number1 * number2);
        }catch (Exception e){
            result.setSuccess(false);
            result.setErrorMessage("Error: " + e.getMessage());
            result.setResult(null);
        }

        return result;
    }

    public void print(ExecutionResult result){
        if(result.getErrorMessage().equals("")){
            System.out.printf("MultiplyTaskExecutor: %n%s%n%s%n%n", result.isSuccess(), result.getResult());
        }else {
            System.out.printf("MultiplyTaskExecutor with error: %n%s%n%s%n%s%n%n", result.isSuccess(), result.getErrorMessage(), result.getResult());
        }
    }
}
