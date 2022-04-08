public class Main {
    public static void main(String[] args) {
          ExecutionResult result = null;
          MultiplyTaskExecutor multiplyTaskExecutor = new MultiplyTaskExecutor();
          result = multiplyTaskExecutor.multiply(999999999999999999L, 999999999999999999L);
          multiplyTaskExecutor.print(result);
          result = multiplyTaskExecutor.multiply(9L, 9L);
          multiplyTaskExecutor.print(result);

          StringAppendExecutor stringAppendExecutor = new StringAppendExecutor();
          result = stringAppendExecutor.append("Hello ", "World!");
          stringAppendExecutor.print(result);
          result = stringAppendExecutor.append("Hippopotomonstrosesquippedaliophobia Pneumonoultramicroscopicsilicovolcanoconiosis", "Pneumonoultramicroscopicsilicovolcanoconiosis  ");
          stringAppendExecutor.print(result);
    }
}
