package proxy;

/**
 * 프록시 패턴(Proxy Pattern)은 객체의 대리자 또는 인터페이스 역할을 하는 객체를 제공하는 구조적 디자인 패턴 중 하나입니다.
 * 프록시 객체는 실제 객체에 대한 접근을 제어하거나, 추가적인 기능을 제공할 수 있습니다.
 *
 * 1. 가상 프록시 (Virtual Proxy): 실제 객체의 생성이 비용이 많이 드는 경우, 프록시가 이를 대신하여 실제 객체의 생성을 지연시킵니다.
 * 예를 들어, 이미지가 로드되기 전까지는 프록시가 이를 대신하여 가상 이미지를 표시하는 경우가 있습니다.
 *
 * 2. 보호 프록시 (Protection Proxy): 실제 객체에 대한 접근을 제어하고 권한을 확인하여,
 * 적절한 권한을 가진 사용자만이 객체에 접근할 수 있도록 합니다.
 *
 * 3. 원격 프록시 (Remote Proxy): 다른 주소 공간에 있는 객체에 대한 접근을 제어합니다.
 * 예를 들어, 클라이언트가 네트워크를 통해 서버의 객체에 접근할 때, 원격 프록시가 이를 대신하여 처리할 수 있습니다.
 *
 * 4. 캐싱 프록시 (Caching Proxy): 실제 객체에 대한 요청 결과를 캐싱하여, 동일한 요청에 대해 다시 실제 객체를 호출하지 않고,
 * 캐시된 데이터를 반환하는 역할을 합니다.
 *
 */
// 클라이언트 코드
public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        // 실제 이미지 로딩 없이, 처음에는 프록시를 통해 접근
        image.display();  // Loading test_image.jpg
        // Displaying test_image.jpg

        // 이후의 호출에서는 캐시된 이미지를 사용
        image.display();  // Displaying test_image.jpg
    }
}
