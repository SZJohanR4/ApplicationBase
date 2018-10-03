package Authentificacion;

public class usuario {

    public usuario() {
    }

    public boolean getAuth(String user, String pass){
        boolean auth;
        if(user=="uniminuto" && pass=="1234"){
            auth=true;
        }else{
            auth=false;
        }
        return auth;
    }

}
