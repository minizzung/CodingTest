-- 코드를 입력하세요
(SELECT DATE_FORMAT(SALES_DATE,'%Y-%m-%d') AS SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT
FROM ONLINE_SALE
WHERE 1=1
AND YEAR(SALES_DATE) = 2022
AND MONTH(SALES_DATE) = 03
UNION
SELECT DATE_FORMAT(SALES_DATE,'%Y-%m-%d') AS SALES_DATE, PRODUCT_ID, NULL AS USER_ID, SALES_AMOUNT
FROM OFFLINE_SALE
WHERE 1=1
AND YEAR(SALES_DATE) = 2022
AND MONTH(SALES_DATE) = 03)
ORDER BY SALES_DATE, PRODUCT_ID, USER_ID