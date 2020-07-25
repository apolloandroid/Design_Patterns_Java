package phoneexample.headphones;

public class AnyOtherHeadPhones implements HeadPhones {
    @Override
    public void printName() {
        System.out.println("Headphones name is not important, but it is not AirPods");
    }
}
