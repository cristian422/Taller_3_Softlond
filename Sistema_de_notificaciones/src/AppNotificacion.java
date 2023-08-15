public class AppNotificacion {
    public static void main(String[] args) throws Exception {
        

        Mensajeria correo=new Correos();
        Mensajeria msm=new Msm();
        Mensajeria push=new Push();

        correo.notificacion();
        msm.notificacion();
        push.notificacion();
    }
}
