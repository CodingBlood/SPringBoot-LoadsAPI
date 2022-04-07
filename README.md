Load’s APIS


1. post "/load"

   {
   "loadId": 7,
   "loadingPoint": "Goa",
   "unloadingPoint": "Kerela",
   "productType": "Bananas",
   "truckType": "canter",
   "shipperID": 8001,
   "comment": "Going Onn...",
   "date": "12-03-2022",
   "noOfTruck": 6,
   "weight": 7782
   }

Response:loads details added successfully

2. GET “/load”

Query params - (shipperId)

Response:list of loads with this shipperId

3. GET “load/{loadId}”
4. PUT “load/{loadId}”
{
"loadingPoint": "alwar",
"unloadingPoint": "jaipur",
"productType": "chemicals",
"truckType": "canter",
"noOfTrucks": "1",
"weight": "100",
"comment": "",
“Date” : “dd-mm-yyyy”
}
5. DELETE “load/{loadId}”
6. GetALL "/loads"

