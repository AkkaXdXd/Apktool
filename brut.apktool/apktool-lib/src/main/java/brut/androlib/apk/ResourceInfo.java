package brut.androlib.apk;

public class ResourceInfo implements YamlSerializable {
    public String renameResourcesPackage;

    @Override
    public void readItem(YamlReader reader) {
        YamlLine line = reader.getLine();
        switch (line.getKey()) {
            case "renameResourcesPackage": {
                renameResourcesPackage = line.getValue();
                break;
            }
        }
    }

    @Override
    public void write(YamlWriter writer) {
        writer.writeString("renameResourcesPackage", renameResourcesPackage);
    }
}
