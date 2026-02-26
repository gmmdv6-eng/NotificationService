package com.refactoring.projects.project04;

/**
 * Servicio de notificaciones refactorizado mediante el Patrón Strategy.
 */
public class NotificationService {
    
    private MessageNotifier notifier;

    /**
     * Inyecta la estrategia de envío deseada (Email, SMS, Push).
     * @param notifier Instancia de la clase de envío.
     */
    public void setNotifier(MessageNotifier notifier) {
        this.notifier = notifier;
    }

    /**
     * Envía la notificación delegando la responsabilidad en la estrategia configurada.
     */
    public void sendNotification(String message, String recipient) {
        if (notifier == null) {
            System.out.println("Error: No se ha configurado un medio de envío.");
            return;
        }
        notifier.send(message, recipient);
    }
}
