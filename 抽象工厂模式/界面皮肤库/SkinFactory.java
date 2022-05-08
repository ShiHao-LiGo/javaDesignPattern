/**
 * 界面皮肤工厂接口，充当抽象工厂
 */
public interface SkinFactory {
    public Button createButton();
    public TextField createTextField();
    public ComboBox createComboBox();
}
