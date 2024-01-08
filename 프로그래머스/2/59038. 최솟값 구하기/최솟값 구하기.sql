-- 코드를 입력하세요
SELECT 
    a.datetime 
FROM 
    (SELECT * from animal_ins order by datetime) a
WHERE ROWNUM = 1;