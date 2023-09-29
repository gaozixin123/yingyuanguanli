import java.io.InputStreamReader;
public class User {
    private String loginName;
    private String password;
    private  String userName;
    private String mail;
    public User(String loginName,String password,String userName,String mail){
        this.loginName=loginName;
        this.password=password;
        this.userName=userName;
        this.mail=mail;
    }
    public User(){}
    public String getLoginName(){
        return loginName;
    }
    public void setLoginName(String loginName){
        this.loginName=loginName;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getMail(){
        return mail;
    }
    public void setMail(String mail){
        this.mail=mail;
    }
}
