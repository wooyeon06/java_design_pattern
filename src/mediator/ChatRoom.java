package mediator;

import java.util.ArrayList;
import java.util.List;

// Concrete Mediator 클래스
class ChatRoom implements ChatMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            // 메시지를 보낸 사용자 본인에게는 메시지를 보내지 않음
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
