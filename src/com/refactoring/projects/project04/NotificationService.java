
package com.refactoring.projects.project04;

public class NotificationService {

    /**
     * Envía una notificación según el tipo especificado.
     * @param tipo El medio de envío (email, sms, push).
     * @param mensaje El contenido del mensaje.
     * @param destinatario La dirección o número del receptor.
     */
    public void sendNotification(String tipo, String mensaje, String destinatario) {
        if (tipo.equals("email")) {
            sendEmail(mensaje, destinatario);
        } else if (tipo.equals("sms")) {
            System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
        } else if (tipo.equals("push")) {
            System.out.println("Enviando push a " + destinatario + ": " + mensaje);
        }
    }

    private void sendEmail(String mensaje, String destinatario) {
        System.out.println("Enviando email a " + destinatario + ": " + mensaje);
    }
}
