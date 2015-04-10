package beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named //(appele du robot)
@RequestScoped
public class BeanController {

    private String login;

    public BeanController() {
        System.out.println("****************** created ******************");
    }
    
    public String faireUnTruc(){
        System.out.println("coucou toi !");
        return "confirmation";
    }
    
    @PostConstruct
    public void plop(){
        System.out.println("après creation");
    }
    
    @PreDestroy
    public void plup(){
        System.out.println("avant destruction");
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

}
