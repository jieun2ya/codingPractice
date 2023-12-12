SELECT FOOD_TYPE, MAX(FAVORITES)
                    FROM REST_INFO
                    GROUP BY FOOD_TYPE