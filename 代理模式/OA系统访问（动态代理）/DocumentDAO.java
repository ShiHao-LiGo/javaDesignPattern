/**
 * 文档DAO类，具体主题角色
 */
public class DocumentDAO implements AbstractDocumentDAO{
    @Override
    public Boolean deleteDocumentById(String documentId) {
        if(documentId.equalsIgnoreCase("D001")){
            System.out.println("删除ID为"+documentId+"的文档信息成功！");
            return true;
        }else{
            System.out.println("删除ID为"+documentId+"的文档信息失败！");
            return false;
        }
    }
}
