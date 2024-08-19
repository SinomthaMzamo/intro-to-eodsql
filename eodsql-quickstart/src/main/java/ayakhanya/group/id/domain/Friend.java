package ayakhanya.group.id.domain;

import java.util.List;
/**
 * Represents a friend in a one-to-many entity relationship, where a group of friends can have mutual friends.
 */
public class Friend {
    private Person self;
    private List<Friend> friendsList;

    // Getters and Setters

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
