-- 코드를 입력하세요
SELECT animal_type
    , DECODE(name, null,'No name', name) AS NAME
    , sex_upon_intake 
from animal_ins 
order by animal_id;