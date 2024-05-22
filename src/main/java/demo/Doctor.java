package demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope(scopeName = "prototype")
//public class Doctor implements Staff, InitializingBean, DisposableBean {
public class Doctor implements Staff {
    private String qualification;

//    public Doctor(String qualification) {
//        this.qualification=qualification;
//    }

    public void assist(){
        System.out.println("doctor will assist");
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("make bean");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("destroy bean");
//    }

//    public void init(){
//        System.out.println("init method called");
//    }
//
//    public void destroy(){
//        System.out.println("destroyed called");
//    }

    @PostConstruct
        public void postcon(){
        System.out.println("post construct called");
    }

    @PreDestroy
        public void destroy(){
        System.out.println("pre destroyed called");
    }
    public String getQualification() {
        return qualification;
    }
//
//    public void setQualification(String qualification) {
//        this.qualification = qualification;
//    }
}
