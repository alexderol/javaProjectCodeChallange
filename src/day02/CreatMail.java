package day02;

public class CreatMail {
    /* İşe yeni başlayan arkadaşlarımızın kullanımı için arkadaşlara şirket maili ve şifresi create edilip verilmelidir.
           --> ** Bir sonraki sprintte create edilen bu mail otomatik olarak IT Manager, HR Manager, Team Lead e mail atılacaktır. Bunu göz önünde bulundurarak proglama yapınız.
   Nitelikler:
   firtsName: Çalışan İsmi
   lastName: Çalışan soyadı
   passWord: Çalışan şifresi
   department: Çalışılacak Departman
   email: Çalışan Email
   emailSuffix: Şirket Domaini (clarusway.com)
   mailBoxCapasity : 1000
   defaultpassWordLenght : 12
   Metotlar:
   Çalışanın adı ve soyadı alacak şekilde parametreli bir construcor create ediniz (firtsName,lastName)
   setDepartment fonks. creat ediniz. Bu fonk çalışanın departmanını setlemek için kullanılmalıdır. Şirket departmanları aşağıdaki tabloda belirtilmiştir. Çalışanın istihdam edileceği departman emailine eklenecektir.
           testautomation.
                   fullstackdeveloper.
                   salesforce.
                   hiçbiri (Eğer çalışan yukarıda ki departmanlardan birinde istihdam edilmiyorsa mailine departman setlenmemelidir.)
   setRandomPassWord() password ün uzunluğunu alarak random bir şekilde password create edebilen bir fonk. olmalıdır. Kullanıcının passwordun de aşağıda belirtilmiş numeric, alphabetic ve speacil karakterler bulunabilir. ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi
   showInfo() çalışanın adı, soyadı, email, password unu konsolda gösterecek bir metot oluşturunuz.

   **java otomatik mail attıran code google la
   */
    String firtsName;
    String lastName;
    String passWord;
    String department;
    String email;
    String emailSuffix = "@clarusway.com";
    double mailBoxCapasity = 1000;
    int defaultpassWordLenght = 0;


    public CreatMail(String firtsName, String lastName, String department) {
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.department =department;
        this.email = setEmail(department);
        this.passWord = setRandomPassWord();







    }

    public String setEmail (String department ) {


        email = firtsName.concat(lastName);

        String depArr[] = {"Test Automation", "Full Stack Developer", "Sales Force"};

        if (department.equalsIgnoreCase(depArr[0])) {
            email = email.concat("testauto");
        } else if (department.equalsIgnoreCase(depArr[1])) {
            email = email.concat("fsd");
        } else if (department.equalsIgnoreCase(depArr[2])) {
            email = email.concat("sf");
        } else {
            this.email += email;
        }
        email = email.concat(emailSuffix);


        return email;
    }

    public String setRandomPassWord() {
        String alphaNumericString = "ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi";

        StringBuilder sb = new StringBuilder(12);
        for (int i = 0; i < 12; i++) {

            int buİndexiAL = (int) (Math.random() * alphaNumericString.length());
            sb.append(alphaNumericString.charAt(buİndexiAL));

        }



        return sb.toString();
    }

    public void showInfo() {
        System.out.println("firtsName='" + firtsName + "\'\n" +
                "lastName='" + lastName + "\'\n" +
                "passWord='" + passWord + "\'\n" +
                "department='" + department + "\'\n" +
                "email='" + email + "\'\n");
    }

}
