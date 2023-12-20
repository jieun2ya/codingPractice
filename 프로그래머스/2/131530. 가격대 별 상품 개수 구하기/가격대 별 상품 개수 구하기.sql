SELECT 
    (PRICE-PRICE%10000) AS PRICE_GROUP
    , count(*) AS PRODUCTS
from product
group by PRICE_GROUP
order by PRICE_GROUP