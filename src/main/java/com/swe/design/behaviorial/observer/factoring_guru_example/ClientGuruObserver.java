package com.swe.design.behaviorial.observer.factoring_guru_example;

public class ClientGuruObserver {
  public static void execute() {
    Editor editor = new Editor();

    EventListener email = new EmailAlertListener(editor);

    EventListener login = new LoggingListenter(editor);

    editor.execute();
  }
}
