package Day01_SeleniumMaven;

import org.junit.*;

public class C02_JunitAnnotations {
    //1. TEST
    //2.TEST
    //3.TEST
    //4.TEST (geliştirme aşamasında bu yuzden rapora dahil olmasın)

    //her testimizden önce ve sonra calışması gereken kod bloklarımız (methodlarımız) mevcut
    //tum testlerin öncesinde ve sonrasında calışması gerekn methodlarımız mevcut

    /*

//        1. @Test -> Marks a method as a TEST CASE.
//        2. @Before : Runs before EACH @Test annotation.
//        3. @After : Runs after EACH @Test annotation.
//        4. @BeforeClass : Runs before each class only once.
//        5. @AfterClass : Runs after each class only once.
//        6. @Ignore : Skipping a test case.
     */
    @Test
    public void test01() {
        System.out.println("1. test yapiliyor...");
    }

    @Test
    public void test02() {
        System.out.println("2. test yapiliyor...");
    }

    @Test
    public void test03() {
        System.out.println("3. test yapiliyor...");
    }


    @Test
    @Ignore
    public void test04() {
        System.out.println("4. test gelistirme aşamasında...");
    }
    @Before
    public void beforeEach(){
        System.out.println("Method beforeEach kod bloğu calıştı");
    }
    @After
    public void afterEach(){
        System.out.println("Method afterEach kod bloğu calıştı");
    }
    @BeforeClass
    public static void beforeAll(){
        System.out.println("Method beforeAll kod bloğu calıştı");
    }
    @AfterClass
    public static void afterAll(){
        System.out.println("Method afterAll kod bloğu calıştı");
    }
}
