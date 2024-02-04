import java.awt.event.WindowListener;
import java.util.LinkedList;
import java.util.Queue;

public class Program {
    private Queue<String> recentDocuments;
    private int maxSize;  // 큐의 최대 크기

    public Program(int maxSize) {
        this.recentDocuments = new LinkedList<>();
        this.maxSize = maxSize;
    }

    // 문서를 큐에 추가
    public void addDocument(String document) {
        // 큐의 크기가 최대 크기를 초과하면 가장 오래된 문서를 제거
        while (recentDocuments.size() >= maxSize) {
            recentDocuments.poll();
        }
        recentDocuments.offer(document);
    }

    // 최근 사용 문서 목록 출력
    public void printRecentDocuments() {
        System.out.println("Recent Documents:");
        for (String document : recentDocuments) {
            System.out.println(document);
        }
        System.out.println("---------------");
    }

    public static void main(String[] args) {
    	Program recentDocumentsQueue = new Program(3);

        recentDocumentsQueue.addDocument("Document A");
        recentDocumentsQueue.addDocument("Document B");
        recentDocumentsQueue.addDocument("Document C");

        recentDocumentsQueue.printRecentDocuments();

        recentDocumentsQueue.addDocument("Document D");
        recentDocumentsQueue.addDocument("Document E");

        recentDocumentsQueue.printRecentDocuments();
    }
}
