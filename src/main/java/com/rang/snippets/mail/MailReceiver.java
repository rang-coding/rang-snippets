package com.rang.snippets.mail;

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;

public class MailReceiver {

	private static final String PROTOCOL = "imaps";
	private static final String HOST = "imap.gmail.com";
	private static final String USER = "yyyyy@gmail.com";
	private static final String PASSWORD = "xxxxx";
	private static final String INBOX_FOLDER = "inbox";

	public static void receiveMails() {

		Properties props = System.getProperties();
		props.setProperty("mail.store.protocol", PROTOCOL);
		Session session = Session.getDefaultInstance(props, null);

		try (Store store = session.getStore(PROTOCOL)) {
			store.connect(HOST, USER, PASSWORD);
			try (Folder folder = store.getFolder(INBOX_FOLDER)) {
				folder.open(Folder.READ_ONLY);

				Message[] messages = folder.getMessages();
				System.out.println("Number of Messages: " + folder.getMessageCount() + " ("
						+ folder.getUnreadMessageCount() + " unread)");

				for (Message message : messages) {
					System.out.println("--------");
					System.out.println("Subject: " + message.getSubject());
					System.out.println("From:    " + message.getFrom()[0]);
					System.out.println("To:      " + message.getAllRecipients()[0]);
					System.out.println("Date:    " + message.getReceivedDate());
				}

			}
		} catch (MessagingException e) {
			System.out.println("" + e);
		}

	}

	public static void main(String[] args) {
		receiveMails();
	}

}
