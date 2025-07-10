package 종합.예제6;

    //(1) 데이터 모델 : 게시물 모델링
    public class Board {
        // 1. 멤버변수 : 주로 멤버변수는 private 한다.

        // 2. 생성자 : *주로* 기본생성자 1개와 전체메개변수 갖는 생성자1개 한다. (2개)
        private String content;
        private String writer;


        // 3. 메소드 : private으로 선언된 멤버변수를 외부(다른클래스)로 부터 접근할 수 있도록 getter/setter 지원한다.
        // 자동 : 해당 클래스에서 오른쪽 클릭 -> [생성] -> [getter 및 setter]


        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getWriter() {
            return writer;
        }

        public void setWriter(String writer) {
            this.writer = writer;
        }

        public Board(String content, String writer) {
            this.content = content;
            this.writer = writer;


        }// 2) 개발자는 알아야되니 toString해야됨.
            @Override
            public String toString() {
                return "Board{" +
                        "content='" + content + '\'' +
                        ", writer='" + writer + '\'' +
                        '}';
            }
    }



