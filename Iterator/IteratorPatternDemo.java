public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepositoryDemo namesRepository = new NameRepositoryDemo();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}