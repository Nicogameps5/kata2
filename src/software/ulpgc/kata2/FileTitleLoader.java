package software.ulpgc.kata2;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileTitleLoader implements TitleLoader{
    private final File file;
    private final TitleDeserializer deserializer;

    @Override
    public List<Title> load() throws IOException {
        return null;
    }
}
