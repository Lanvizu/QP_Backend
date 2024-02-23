package inf.questpartner.dto.room;

import inf.questpartner.domain.room.Room;
import inf.questpartner.domain.room.common.RoomThumbnail;
import inf.questpartner.domain.room.common.RoomType;
import inf.questpartner.domain.room.common.tag.TagOption;
import inf.questpartner.domain.users.user.User;
import lombok.Data;
import java.util.List;


@Data
public class CreateRoomRequest {

    private String title; // 방 제목
    private int expectedUsers; // 인원수 제한

    private RoomThumbnail thumbnail; // 방 섬네일
    private List<TagOption> tags; // 방 태그표시들

    public Room toRoomEntity(User user) {
        return Room.createRoom()
                .author(user.getNickname())
                .title(title)
                .expectedUsers(expectedUsers)
                .thumbnail(thumbnail)
                .build();
    }
}
