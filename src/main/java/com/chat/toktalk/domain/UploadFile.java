package com.chat.toktalk.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "upload_file")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NON_PRIVATE)
@Getter
@Setter
public class UploadFile implements Serializable {
    public UploadFile() {
        this.regdate = LocalDateTime.now();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @Column(name = "content_type")
    @JsonProperty("contentType")
    private String contentType;

    @JsonProperty("length")
    private Long length;

    @Column(name = "file_name")
    @JsonProperty("fileName")
    private String fileName;

    @Column(name = "save_file_name")
    @JsonProperty("saveFileName")
    private String saveFileName;

    @JsonProperty("regdate")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm")
    private LocalDateTime regdate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="message_id")
    private Message message;
}
