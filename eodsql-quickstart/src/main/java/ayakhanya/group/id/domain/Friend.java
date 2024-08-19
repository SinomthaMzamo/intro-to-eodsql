package ayakhanya.group.id.domain;

import java.util.List;
/**
 * in a One to Many Entity Relationship a group of friends can have mutual friends friends
 * */
public class Friend {
    private Person self;
    private List<Friend> friendsList;

    public Person getSelf() {
        return self;
    }

    public void setSelf(Person self) {
        this.self = self;
    }

    public List<Friend> getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(List<Friend> friendsList) {
        this.friendsList = friendsList;
    }
}
