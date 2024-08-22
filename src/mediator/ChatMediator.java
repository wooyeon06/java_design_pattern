package mediator;

// Mediator 인터페이스
interface ChatMediator {
    void sendMessage(String message, User user);

    void addUser(User user);
}
