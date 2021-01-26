package com.javastart.lambdas.emails;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class EmailManager {
    public static void main(String[] args) {
        List<Email> emailList = createEmailList();

        //tylko wysłane emaile
        List<Email> sentEmails = filterEmails(emailList, Email::isSent);
        System.out.println("Wysłane maile:");
        consumeList(sentEmails, System.out::println);

        //filtrowanie maili, w których nadawca lub odbiorca ma wskazany adres email
        List<Email> bartEmails = filterEmails(emailList, sender -> sender.getRecipient().equals("bart@example.com"));
        System.out.println("Maile przefiltrowane na podstawie nadawcy lub odbiorcy");
        consumeList(bartEmails, System.out::println);
    }

    private static <T> List<T> filterEmails(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }

        return result;
    }

    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    private static List<Email> filterEmailsBySenderOrRecipient(List<Email> emails, String emailAddress) {
        List<Email> filteredEmails = new ArrayList<>();
        for (Email email : emails) {
            if (email.getSender().equals(emailAddress) || email.getRecipient().equals(emailAddress))
                filteredEmails.add(email);
        }
        return filteredEmails;
    }

    private static List<Email> filterEmailsSent(List<Email> emails) {
        List<Email> sentEmails = new ArrayList<>();
        for (Email email : emails) {
            if (email.isSent())
                sentEmails.add(email);
        }
        return sentEmails;
    }

    private static List<Email> createEmailList() {
        List<Email> emails = new ArrayList<>();
        emails.add(new Email(
                "joe@example.com",
                "barbara@example.com",
                "Kup bułki",
                "Cześć!, Kup proszę bułki, gdy będziesz wracać z pracy.",
                false)
        );
        emails.add(new Email(
                "carl@example.com",
                "joe@example.com",
                "Nowa inwestycja",
                "Siema! Musimy omówić temat nowej inwestycji, pasuje Ci jutro?",
                true)
        );
        emails.add(new Email(
                "joe@example.com",
                "bart@example.com",
                "Wypad na miasto",
                "Cześć. Idziemy dzisiaj wieczorem z chłopakami na miasto. Dołączasz do nas?",
                true)
        );
        return emails;
    }
}