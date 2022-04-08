public class StringAppendExecutor {

    private ExecutionResult result = new ExecutionResult<>();

   public ExecutionResult<String> append(String string1, String string2){
        String text = string1 + string2;
        if(text.length() <= 128){
            result.setSuccess(true);
            result.setErrorMessage("");
            result.setResult(text);
        }else {
            result.setSuccess(false);
            result.setErrorMessage("The text is longer than 128 letters!!!");
            result.setResult(null);
        }
        return result;
    }

    public void print(ExecutionResult result){
        if(result.getErrorMessage().equals("")){
            System.out.printf("StringAppendExecutor: %n%s%n%s%n%n", result.isSuccess(), result.getResult());
        }else {
            System.out.printf("StringAppendExecutor with error: %n%s%n%s%n%s%n%n", result.isSuccess(), result.getErrorMessage(), result.getResult());
        }
    }
}
