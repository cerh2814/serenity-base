package starter.ui;


import net.serenitybdd.screenplay.targets.Target;

public class RegisterForm {

    public static Target NAME_FIELD = Target.the("name field").locatedBy("//input[@id='name']");
    public static Target LAST_NAME_FIELD = Target.the("last name field").locatedBy("//input[@id='last-name']");
    public static Target AGE_FIELD = Target.the("age field").locatedBy("//input[@id='age']");
    public static Target COUNTRY_DROPDOWN = Target.the("Select conuntry").locatedBy("//select[@id='country']");
    public static Target INPUT_EMAIL = Target.the("email field").locatedBy("//input[@id='email']");
    public static Target INPUT_SEX = Target.the("input sex").locatedBy("//input[@id='sex-m']");
    public static Target INPUT_DAY = Target.the("input day").locatedBy("//input[@id='tuesday']");
    public static String INPUT_picture = "//input[@id='picture']";
    public static Target BUTTON_SAVE = Target.the("save button").locatedBy("//button[@id='save-btn']");
    //Click.on("//button[@id='save-btn']"),



}

//  Enter.theValue(nameexpected).into("//input[@id='name']"),
//                    Enter.theValue(lastNameexpected).into("//input[@id='last-name']"),
//                    Enter.theValue(ageexpected).into("//input[@id='age']"),
//                    SelectFromOptions.byVisibleText("" + countryexpected + "").from("//select[@id='country']" ),
//                    Click.on("//input[@class='form-check-input' and @value='"+genero+"']"),
//                    Enter.theValue(contraseaexpected).into("//input[@id='email']"),
//                    Click.on(" //input[@class='form-check-input' and @id='"+day+"']"),
//            Upload.theClasspathResource("picture/baby.png")
//            .to(Target.the("upload fields").locatedBy("//input[@id='picture']")),
//        Click.on("//button[@id='save-btn']")