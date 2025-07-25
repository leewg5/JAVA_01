drop database if exists items;
create database items;
use items;

CREATE TABLE item (
item_id INT AUTO_INCREMENT PRIMARY KEY,      -- 고유 식별자
seller_nickname VARCHAR(100) NOT NULL,       -- 판매자 닉네임
item_name VARCHAR(200) NOT NULL,             -- 물품명
description TEXT,                            -- 물품 설명
price INT NOT NULL,                          -- 가격
password VARCHAR(100) NOT NULL,              -- 삭제/수정 시 사용 비밀번호 (해시로 저장하는 것이 보안상 안전)
created_at DATETIME DEFAULT CURRENT_TIMESTAMP, -- 등록일
is_sold BOOLEAN DEFAULT FALSE                -- 판매 여부 (FALSE: 판매중 / TRUE: 판매완료)
);

INSERT INTO item (seller_nickname, item_name, description, price, password, created_at, is_sold)
VALUES
('유재석', '중고품', '새것과 같은 중고품 입니다.', 3000, '1234', '2025-07-24 10:00:00', FALSE),
('시야', '항아리', '고대 유물 스타일 항아리', 5000, 'abcd', '2025-08-20 14:00:00', FALSE),
('김연아', '스케이트화', '실제 경기용으로 사용함', 120000, 'skate123', '2025-06-30 18:30:00', TRUE),
('박명수', 'DJ장비', '중고지만 성능은 좋음', 80000, 'djpass', '2025-07-10 09:20:00', FALSE),
('아이유', '기타', '사인 있는 어쿠스틱 기타', 150000, 'iu4567', '2025-07-15 12:45:00', TRUE),
('장원영', '조명등', '인테리어용 조명, 감성적', 25000, 'light123', '2025-07-18 16:10:00', FALSE),
('이강인', '축구공', '실전 사용품, 싸인 포함', 45000, 'goalpass', '2025-07-11 13:30:00', TRUE),
('정우성', '선글라스', '영화 소품으로 사용됨', 60000, 'sunglass', '2025-06-28 11:00:00', FALSE),
('한지민', '책상', '화이트톤 컴퓨터 책상', 70000, 'desk5678', '2025-07-02 17:40:00', FALSE),
('백종원', '그릴', '캠핑용 전기 그릴', 55000, 'bbqman', '2025-07-05 15:00:00', FALSE),
('송지효', '의자', '게이밍 체어, 상태 좋음', 90000, 'run123', '2025-07-08 10:15:00', TRUE),
('이효리', '마이크', '녹음용 마이크, 스탠드 포함', 95000, 'micpass', '2025-06-25 09:50:00', FALSE),
('박보검', '자전거', '하이브리드 자전거, 깔끔함', 130000, 'bikepass', '2025-07-03 13:00:00', TRUE),
('김고은', '커피머신', '네스프레소 캡슐 머신', 85000, 'coffee01', '2025-07-09 14:20:00', FALSE),
('차은우', '모니터', '27인치 FHD 모니터', 110000, 'screenman', '2025-07-01 11:45:00', FALSE),
('손흥민', '운동화', '경기용 운동화, 실사용', 70000, 'sonpass', '2025-06-29 17:10:00', TRUE),
('윤아', '노트북', '맥북에어 M1, 가벼운 사용감', 980000, 'macpass', '2025-07-06 12:30:00', FALSE),
('김종국', '덤벨세트', '헬스용 덤벨세트 20kg', 60000, 'fitman', '2025-07-13 08:20:00', FALSE),
('박서준', '책장', '4단 원목 책장', 45000, 'books123', '2025-07-17 13:50:00', FALSE),
('정국', '이어폰', '무선 이어폰, 개봉 미사용', 150000, 'jkpass', '2025-07-19 11:10:00', TRUE);

select * from item;
